public class Main {

    public static void main(String[] args) {


//		int[] zahlen = new int[3];
//
//		for(int i=0;i<zahlen.length ;i++)
//			System.out.println(zahlen[i]);


		/*String vorname ="Jens";
		//Klassen*/
//		try {
        //throw new MeineRuntimeExceptionFuerEinBesonderesProblem();
        System.out.println("Start");

        try {

            if(false)
                throw new MeineRuntimeExceptionFuerEinBesonderesProblem();
            else
                //throw new IOException("i=2");
                throw new NullPointerException("i=2");
            //throw new ArrayIndexOutOfBoundsException("i=2");
            //throw new MeineRuntimeExceptionFuerEinBesonderesProblem("hallo");
            //}catch(MeineRuntimeExceptionFuerEinBesonderesProblem e) {
            //System.out.println("weiter 1!");
        }
        catch(ArrayIndexOutOfBoundsException  e) {
            System.out.println("weiter 2!");
        }
        //catch(MeineRuntimeExceptionFuerEinBesonderesProblem mrefebp) {
//		}
//		catch(ArrayIndexOutOfBoundsException aioobe) {
//
//			}
//		catch(RuntimeException e) {
//			System.out.println("weiter irgendwas anderes!");
//		}
//		catch(Exception e) {
//			System.out.println("weiter irgendwas anderes! falls alles schief geht - IOException");
//		}
        System.out.println("Ende");



        try {
            methode();
        } catch (MeineCheckedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public static void methode() throws MeineCheckedException {
        System.out.println("Start");
        throw new MeineCheckedException();
    }
}



class MeineRuntimeExceptionFuerEinBesonderesProblem extends RuntimeException {

    public MeineRuntimeExceptionFuerEinBesonderesProblem() {
        super("noch weiter Infos");
    }

//	public MeineRuntimeExceptionFuerEinBesonderesProblem(String txt) {
//		super(txt);
//	}
//




}


class MeineCheckedException extends Exception{







}