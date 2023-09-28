public class HdmiPort {

    // attributs
    boolean functional  = true;
    String connectedTo = "None";


    // comportements
    
    public boolean checkStatus() {
        return functional;
    }

    public void destroy() {
        functional = false;
    }
    public void repair() {
        functional = true;
    }

    public void connect(String device) {
        connectedTo = device;
    }
    public void disconnect() {
        connectedTo = "None";
    }
}
