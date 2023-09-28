/** Pilote du programme */
public class Main {
    public static void main(String[] args) {
        // créer une instance de l'objet
        HdmiPort hdmi1 = new HdmiPort();
        hdmi1.destroy();
        hdmi1.repair();
        hdmi1.connect("TV");
        hdmi1.disconnect();

        System.out.println("Functioning? " + hdmi1.checkStatus());
        System.out.println("Connected to : " + hdmi1.connectedTo);
        
    }
}