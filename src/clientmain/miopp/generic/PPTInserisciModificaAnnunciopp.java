package clientmain.miopp.generic;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;

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
import com.datasynaptic.portaportese.Rubrictiprec;

public class PPTInserisciModificaAnnunciopp {

    static final String TOKEN = "GF76KIO36LKI797hg3267AqZ";
	public static void main(String[] args) throws ServiceException, RemoteException {
		PortaPorteseServiceSoap service = (new PortaPorteseLocator()).getPortaPorteseServiceSoap();
        testImmobile(service);
	}

    private static void testImmobile(PortaPorteseServiceSoap service)  throws ServiceException, RemoteException {
        // INSERIMENTO
        //Nuovoannunciopp nva = inserisciAnnuncioImmobile(service);
		Modannunciopp mva = modificaAnnuncioImmobile(service);
    }

    private static Nuovoannunciopp inserisciAnnuncioImmobile(PortaPorteseServiceSoap service) throws RemoteException {
		Datinuovoannunciopp da = new Datinuovoannunciopp();
		da.setAuth("GF76KIO36LKI797hg3267AqZ");	// codice di autenticazione
		da.setCodicecliente(100);	// questo corrisponde al vostro codice univoco cliente, 
									// abbiamo presunto sia un codice numerico...
									// la procedura provvedera' a fare l'associazione tra codice "reali" e codice "portaportese"
									// ritorna un errore se il cliente non sara' stato inserito
		
		Rubrictiprec rtp = new Rubrictiprec();
		
		
		rtp.setRubric("CA");	// ville roma
		rtp.setTiprec("130");	// appio tuscolano

		// rtp.setRubric("CC");	// Immobiliare - Locali

		
		Annuncioppins ampp = new Annuncioppins();
		ampp.setCodicerubrica(rtp);
		ampp.setTesto("Test Eddy   Eddy   Eddy  mio 00 000 000 prova prova prova prova prova prova prova prova prova ");
		
		ampp.setAddinfo("Addinfo123prova Addinfo123prova triservizi Addinfo123prova Addinfo123prova Addinfo123prova Addinfo123prova Addinfo123prova Addinfo123prova Addinfo123prova ");
		ampp.setPref1("06");
		ampp.setTelef1("111111");
		ampp.setTipologiaimmobile("APT");	// preso dall'analogo codice presente nelle rubriche dell'albero
		ampp.setSuperficie(200);	// in mq per le case
		ampp.setLocali(5);	// numero delle stanze
		ampp.setClasseenergetica("A");		// codici fissi: A B C D E F G 
		ampp.setLatitudine(42.43443343443);
		ampp.setLongitudine(12.2332232332);
		ampp.setAnno(1990);
		ampp.setPrezzo(145000);
		ampp.setUrl("http://www.google.com");
		da.setAnnuncio(ampp);
		
		byte[][] immagine = new byte[3][];
		immagine[0] = imgToBytes("./immagini/NATURE-Teardrops_1600x1200.jpg");
		immagine[1] = imgToBytes("./immagini/NATURE-SkyStone_1920x1200.jpg");
		immagine[2] = imgToBytes("./immagini/NATURE-EchoBayOntario_1280x1024.jpg");
		da.setImmagine(immagine);
		
		Nuovoannunciopp nva = service.inserisciAnnunciopp(da);
		System.out.println("Codice annuncio: " + nva.getKannuncio());
		System.out.println("Esito: " + nva.getEsito().getStato());
		System.out.println("     : " + nva.getEsito().getDescrizione());
		if (nva.getErrori() != null) {
			System.out.println("Numero Errori: " + nva.getErrori().length);

			for (int j=0; j < nva.getErrori().length; j++) {
				System.out.println("Errore: " + j);
				System.out.println("Campo con errore: " + nva.getErrori(j).getCampo());
				System.out.println("Descrizione errore: " + nva.getErrori(j).getDescrizione());
			}
		}
		return nva;
    }
    private static Modannunciopp modificaAnnuncioImmobile(PortaPorteseServiceSoap service) throws RemoteException {
		Datimodificaannunciopp da = new Datimodificaannunciopp();
		da.setAuth("GF76KIO36LKI797hg3267AqZ");	// codice di autenticazione
		da.setCodicecliente(100);	// questo corrisponde al vostro codice univoco cliente, 
									// abbiamo presunto sia un codice numerico...
									// la procedura provvedera' a fare l'associazione tra codice "reali" e codice "portaportese"
									// ritorna un errore se il cliente non sara' stato inserito
		da.setKannuncio(230858);

		Rubrictiprec rtp = new Rubrictiprec();
		
		
		rtp.setRubric("CA");
		
		Annuncioppins ampp = new Annuncioppins();
		ampp.setCodicerubrica(rtp);
		ampp.setTesto("MOD MOD Test Eddy   Eddy   Eddy  mio 00 000 000 prova prova prova prova prova prova prova prova prova ");
		
		ampp.setAddinfo("Addinfo123prova 3 camere da letto Addinfotriservizi123prova Addinfo123prova Addinfo123prova Addinfo123prova Addinfo123prova Addinfo123prova Addinfo123prova Addinfo123prova ");
		ampp.setPref1("06");
		ampp.setTelef1("111111");
		ampp.setTipologiaimmobile("ATT");	// preso dall'analogo codice presente nelle rubriche dell'albero
		ampp.setSuperficie(200);	// in mq per le case
		ampp.setLocali(7);	// numero delle stanze
		ampp.setClasseenergetica("A");		// codici fissi: A B C D E F G 
		ampp.setLatitudine(41.7453);
		ampp.setLongitudine(12.49348);
		ampp.setAnno(1995);
		ampp.setPrezzo(121145000);
		ampp.setUrl("http://www.google.com");
		da.setAnnuncio(ampp);
		
		byte[][] immagine = new byte[2][];
		immagine[0] = imgToBytes("./immagini/NATURE-Teardrops_1600x1200.jpg");
		immagine[1] = imgToBytes("./immagini/NATURE-SkyStone_1920x1200.jpg");
		da.setImmagine(immagine);
		
		Modannunciopp mva = service.modificaAnnunciopp(da);
		System.out.println("Esito: " + mva.getEsito().getStato());
		System.out.println("     : " + mva.getEsito().getDescrizione());
		if (mva.getErrori() != null) {
			System.out.println("Numero Errori: " + mva.getErrori().length);

			for (int j=0; j < mva.getErrori().length; j++) {
				System.out.println("Errore: " + j);
				System.out.println("Campo con errore: " + mva.getErrori(j).getCampo());
				System.out.println("Descrizione errore: " + mva.getErrori(j).getDescrizione());
			}
		}
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