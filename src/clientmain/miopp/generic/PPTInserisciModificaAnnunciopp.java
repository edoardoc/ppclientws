package clientmain.miopp.generic;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.xml.rpc.ServiceException;

import com.datasynaptic.portaportese.Annuncioppins;
import com.datasynaptic.portaportese.Datimodificaannunciopp;
import com.datasynaptic.portaportese.Datinuovoannunciopp;
import com.datasynaptic.portaportese.Errorecampo;
import com.datasynaptic.portaportese.Modannunciopp;
import com.datasynaptic.portaportese.Nuovoannunciopp;
import com.datasynaptic.portaportese.PortaPorteseLocator;
import com.datasynaptic.portaportese.PortaPorteseServiceSoap;
import com.google.gson.Gson;

public class PPTInserisciModificaAnnunciopp {

    static final String TOKEN = "GF76KIO36LKI797hg3267AqZ";
	public static void main(String[] args) throws ServiceException, RemoteException {
		Gson gson = new Gson();

		PortaPorteseServiceSoap service = (new PortaPorteseLocator()).getPortaPorteseServiceSoap();

        //testImmobile(gson, service);        
        testAutomobile(gson, service);
	}
    private static void testImmobile(Gson gson, PortaPorteseServiceSoap service)  throws ServiceException, RemoteException {
        // INSERIMENTO
        Nuovoannunciopp nva = inserisciAnnuncioImmobile(gson, service);
		System.out.println("Codice annuncio: " + nva.getKannuncio());
		System.out.println("Esito: " + nva.getEsito().getStato());
		System.out.println("     : " + nva.getEsito().getDescrizione());
		if (nva.getErrori() != null) {
            loggaErrori(nva.getErrori());
		}

        // MODIFICA
        int annuncioDaModificare = nva.getKannuncio();
        Modannunciopp mva = modificaAnnuncio(gson, service, annuncioDaModificare);
		System.out.println("Esito: " + mva.getEsito().getStato());
		System.out.println("     : " + mva.getEsito().getDescrizione());
		if (mva.getErrori() != null) {
            loggaErrori(nva.getErrori());
		}
    }

    private static void testAutomobile(Gson gson, PortaPorteseServiceSoap service)  throws ServiceException, RemoteException {
        // INSERIMENTO
        Nuovoannunciopp nva = inserisciAnnuncioAuto(gson, service);
		System.out.println("Codice annuncio: " + nva.getKannuncio());
		System.out.println("Esito: " + nva.getEsito().getStato());
		System.out.println("     : " + nva.getEsito().getDescrizione());
		if (nva.getErrori() != null) {
            loggaErrori(nva.getErrori());
		}
    }

    private static Nuovoannunciopp inserisciAnnuncioAuto(Gson gson, PortaPorteseServiceSoap service) throws RemoteException {
        Datinuovoannunciopp da = new Datinuovoannunciopp();
		da.setAuth(TOKEN); 			// codice di autenticazione
		da.setCodicecliente(100);   // questo corrisponde al vostro codice univoco cliente, 
									// abbiamo presunto sia un codice numerico...
									// la procedura provvedera' a fare l'associazione tra codice "reali" e codice "portaportese"
									// ritorna un errore se il cliente non sara' stato inserito

		Annuncioppins ampp = new Annuncioppins();
		ampp.setIdcategoria(24); 					// "ID": 24, Auto
                                                    // come da http://stage.data.portaportese.it/albero.json 

		ampp.setTitolo("Alfa 156 Sportwagon"); 	// 
		ampp.setDescrizioneLunga("L'Alfa Romeo 156 è stato un importante passo avanti per la casa automobilistica italiana. Presentava un nuovo linguaggio di design rispetto al suo predecessore nel 1997, quando fu presentata al pubblico. Ha anche vinto il premio \"Auto europea dell'anno\" nel 1998. Era una berlina sportiva con il vero DNA Alfa Romeo. Dalla parte anteriore al montante B, l'Alfa 156 Sportwagon sembrava simile alla versione berlina. Dopo il montante B, il tetto allungato ha cambiato la forma dell'auto. Non voleva essere giudicata come una normale auto di famiglia, il lato inclinato e corto faceva sembrare l'auto più simile a un'autovettura a tre oa cinque porte estesa piuttosto che a una station-wagon.");
		
		// creo la struttura che conterra' le caratteristiche
		Map<String, Object> caratteristicheOut = new HashMap<String, Object>();
		caratteristicheOut.put("offro_cerco", "Offro");

		/* 
            come da http://stage.data.portaportese.it/albero.json 
            "tipologia": {
                "values": [
                    "Minicar",
                    "City Car - Utilitaria",
                    "Berlina",
                    "Station Wagon",
                    "Monovolume",
                    "SUV - Crossover",
                    "Fuoristrada - Pickup",
                    "Cabrio - Roadster",
                    "Sportiva - CoupÃ©",
                    "Altro"
                ]
            },
		*/
		caratteristicheOut.put("tipologia", "Station Wagon");

		caratteristicheOut.put("classe_emissioni", "Pre-euro"); // come da http://stage.data.portaportese.it/albero.json
		caratteristicheOut.put("anno_immatricolazione", "1997"); // come da http://stage.data.portaportese.it/albero.json
		caratteristicheOut.put("km", "234000"); 
        caratteristicheOut.put("marca", "Alfa Romeo"); // come da http://stage.data.portaportese.it/albero.json
        caratteristicheOut.put("alfa_romeo", "156"); // come da http://stage.data.portaportese.it/albero.json

		String dati_caratteristicheOut = gson.toJson(caratteristicheOut);
		ampp.setCaratteristiche(dati_caratteristicheOut);
		ampp.setLatitudine(42.43443343443);
		ampp.setLongitudine(12.2332232332);
		ampp.setPrezzo(35500);
		da.setAnnuncio(ampp);

		byte[][] immagine = new byte[4][];
		immagine[0] = imgToBytes("immagini/ALFA-ROMEO-156-Sportwagon-3511_34.jpg");
		immagine[1] = imgToBytes("immagini/ALFA-ROMEO-156-Sportwagon-3511_35.jpg");
		immagine[2] = imgToBytes("immagini/ALFAROMEO156Sportwagon-3511_18.jpg");
		immagine[3] = imgToBytes("immagini/ALFAROMEO156Sportwagon-3511_23.jpg");
		da.setImmagine(immagine);

		Nuovoannunciopp nva = service.inserisciAnnunciopp(da);
        return nva;
    }

    private static Nuovoannunciopp inserisciAnnuncioImmobile(Gson gson, PortaPorteseServiceSoap service) throws RemoteException {
        Datinuovoannunciopp da = new Datinuovoannunciopp();
		da.setAuth(TOKEN); 			// codice di autenticazione
		da.setCodicecliente(100);   // questo corrisponde al vostro codice univoco cliente, 
									// abbiamo presunto sia un codice numerico...
									// la procedura provvedera' a fare l'associazione tra codice "reali" e codice "portaportese"
									// ritorna un errore se il cliente non sara' stato inserito

		Annuncioppins ampp = new Annuncioppins();
		ampp.setIdcategoria(15); 					// "ID": 15, Residenziale
		ampp.setTitolo("prova annuncio immobile"); 	// 
		ampp.setDescrizioneLunga("NUOVO test annuncio di prova mio 00 000 000 prova prova prova prova prova prova prova prova prova ");
		
		// creo la struttura che conterra' le caratteristiche
		Map<String, Object> caratteristicheOut = new HashMap<String, Object>();
		caratteristicheOut.put("offro_cerco", "Offro");

		/* "Tipologia": {
                "values": [
                    "Appartamento",
                    "Appartamento in villa",
                    "Attico",
                    "Loft",
                    "Mansarda",
                    "Open space",
                    "Villa a schiera",
                    "Villa unifamiliare",
                    "Villa bifamiliare",
                    "Villa plurifamiliare",
                    "Stabile o palazzo",
                    "Cieloterra",
                    "Dimora storica",
                    "Cantina",
                    "Soffitta",
                    "Casale",
                    "Rustico",
                    "Chalet",
                    "Box o garage",
                    "Posto auto",
                    "Posto moto"
                ]
            },
		*/
		caratteristicheOut.put("tipologia", "Mansarda");
		
        /* "Contratto": {
                "values": [
                    "Vendita",
                    "Affitto",
                    "Asta"
                ]
            },
        */
        caratteristicheOut.put("contratto", "Affitto");
        

        /* "Contratto_affitto": {
                "values": [
                    "4+4 libero",
                    "3+2 concordato",
                    "Transitorio (6-36 mesi)"
                ]
            },
        */
        caratteristicheOut.put("contratto_affitto", "3+2 concordato");

		caratteristicheOut.put("riferimento", 1234);
		caratteristicheOut.put("superficie", 50);
		caratteristicheOut.put("superficie_esterna", 20);

        /*

        */
		caratteristicheOut.put("ultimo_piano", false);

        /* "Piano": {
                "values": [
                    "Interrato",
                    "Seminterrato",
                    "Piano strada",
                    "Piano terra",
                    "Piano ammezzato",
                    "Piano rialzato",
                    "1° piano",
                    "2° piano",
                    "3° piano",
                    "4° piano ",
                    "5° piano ",
                    "6° piano",
                    "7° piano",
                    "8° piano",
                    "9° piano",
                    "10° piano",
                    "\u003e11° piano",
                    "Su più livelli"
                ]
            },
        */
        caratteristicheOut.put("piano", "Piano rialzato");
        
		caratteristicheOut.put("locali", 5);
		caratteristicheOut.put("camere_letto", 2);
		caratteristicheOut.put("altre_stanze", 3);
		caratteristicheOut.put("bagni", 2);

        /* "Cucina": {
                "values": [
                    "Abitabile",
                    "Semi abitabile",
                    "Angolo cottura",
                    "Cucinotto",
                    "A vista"
                ]
            },
        */
		caratteristicheOut.put("cucina", "Angolo cottura");
        
        /* "Garage": {
                "values": [
                    "1 auto",
                    "2 auto",
                    "3 o più"
                ]
            },        
        */
        caratteristicheOut.put("garage", 2);

		caratteristicheOut.put("giardino", "Privato");

        /* "Riscaldamento": {
                "values": [
                    "Autonomo",
                    "Condominiale"
                ]
            },
        */
        caratteristicheOut.put("riscaldamento", "Condominiale");
        
		caratteristicheOut.put("arredamento", "Parzialmente arredato");

        /* "Classe_energetica": {
                "values": [
                    "A1",
                    "A2",
                    "A3",
                    "A4",
                    "A+",
                    "A",
                    "B",
                    "C",
                    "D",
                    "E",
                    "F",
                    "G",
                    "In attesa di certificazione",
                    "Proprietà esente",
                    "Non classificabile"
                ]
            }
        */
		caratteristicheOut.put("classe_energetica", "A4");

        /* "Tipo_proprieta": {
                "values": [
                    "Intera proprietà",
                    "Nuda proprietà",
                    "Parziale proprietà",
                    "Usufrutto",
                    "Multiproprietà",
                    "Diritto di superficie"
                ]
            },
        */
		caratteristicheOut.put("tipo_proprieta", "Parziale proprietà");

        /* "Stato_immobile": {
                "values": [
                    "Nuovo / In costruzione",
                    "Ottimo / Ristrutturato",
                    "Buono / Abitabile",
                    "Da ristrutturare"
                ]
            },
        */
		caratteristicheOut.put("stato_immobile", "Buono / Abitabile");

        /* "Disponibilita": {
                "values": [
                    "Libero",
                    "Occupato"
                ]
            },
        */
        caratteristicheOut.put("disponibilita", "Occupato");

		String dati_caratteristicheOut = gson.toJson(caratteristicheOut);
		ampp.setCaratteristiche(dati_caratteristicheOut);
		ampp.setLatitudine(42.43443343443);
		ampp.setLongitudine(12.2332232332);
		ampp.setPrezzo(145000);
		da.setAnnuncio(ampp);

		byte[][] immagine = new byte[4][];
		immagine[0] = imgToBytes("./immagini/Vela601.jpg");
		immagine[1] = imgToBytes("./immagini/Vela602.png");
		immagine[2] = imgToBytes("./immagini/NATURE-Teardrops_1600x1200.jpg");
		immagine[3] = imgToBytes("./immagini/NATURE-EchoBayOntario_1280x1024.jpg");
		da.setImmagine(immagine);

		Nuovoannunciopp nva = service.inserisciAnnunciopp(da);
        return nva;
    }

    private static Modannunciopp modificaAnnuncio(Gson gson, PortaPorteseServiceSoap service, int idAnnuncio) throws RemoteException {
        Datimodificaannunciopp ma = new Datimodificaannunciopp();
        ma.setAuth(TOKEN); 			// codice di autenticazione
        ma.setCodicecliente(100);   // questo corrisponde al vostro codice univoco cliente, 
                                    // abbiamo presunto sia un codice numerico...
                                    // la procedura provvedera' a fare l'associazione tra codice "reali" e codice "portaportese"
                                    // ritorna un errore se il cliente non sara' stato inserito
        
        ma.setKannuncio(idAnnuncio);// il codice dell'annuncio da modificare
        Annuncioppins ampp = new Annuncioppins();
        ampp.setIdcategoria(15); 					// "ID": 15, Residenziale
        ampp.setTitolo("prova MODIFICA annuncio immobile"); 	// 
        ampp.setDescrizioneLunga("MODIFICATO test annuncio di prova mio 00 000  ");
        
        // creo la struttura che conterra' le caratteristiche
        Map<String, Object> modannuncioOut = new HashMap<String, Object>();
        modannuncioOut.put("offro_cerco", "Cerco");
        modannuncioOut.put("tipologia", "Posto auto");
        modannuncioOut.put("contratto", "Affitto");
        modannuncioOut.put("contratto_affitto", "3+2 concordato");
        modannuncioOut.put("riferimento", 5678);
        modannuncioOut.put("superficie", 30);
        modannuncioOut.put("superficie_esterna", 0);
        modannuncioOut.put("disponibilita", "Libero");
        
        String dati_caratteristicheOut = gson.toJson(modannuncioOut);
        ampp.setCaratteristiche(dati_caratteristicheOut);
        ampp.setLatitudine(42.43443343443);
        ampp.setLongitudine(12.2332232332);
        ampp.setPrezzo(6500);
        ma.setAnnuncio(ampp);
        
        byte[][] immagineMod = new byte[4][];   // IMMAGINI, solo jpg
        immagineMod[0] = imgToBytes("./immagini/Vela601.jpg");
        immagineMod[1] = imgToBytes("./immagini/NATURE-EchoBayOntario_1280x1024.jpg");
        immagineMod[2] = imgToBytes("./immagini/NATURE-SkyStone_1920x1200.jpg");
        immagineMod[3] = imgToBytes("./immagini/NATURE-Teardrops_1600x1200.jpg");
        ma.setImmagine(immagineMod);
        
		Modannunciopp mva = service.modificaAnnunciopp(ma);
        return mva;        
    }

	private static byte[] imgToBytes(String im) {
		byte[] imageInByte = null;
		try {
			BufferedImage originalImage = ImageIO.read(new File(im));

			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write(originalImage, "jpg", baos);
			baos.flush();
			imageInByte = baos.toByteArray();
			baos.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return imageInByte;
	}

	private static int loggaErrori(Errorecampo[] errori) {
		if (errori != null) {
			for (Errorecampo err : errori) {
				System.out.println("Errore campo: " + err.getCampo() + " - " + err.getDescrizione());
			}
		}
		return 0;
	}

}