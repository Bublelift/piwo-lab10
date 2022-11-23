package pwo.lab10.chain;

public class _run {

    public static void main(String[] args) {

        TxtProc procChain = new TxtProcUp();
        procChain.add(new TxtProcDown());
        procChain.add(new TxtProcReverse());
        procChain.add(new TxtProcTrimNumbers());

        Request request0 = new Request("Ala Ma Kota 420", "up");
        Request request1 = new Request("Ala Ma Kota 420", "down");
        Request request2 = new Request("Ala Ma Kota 420", "reverse");
        Request request3 = new Request("Ala Ma Kota 420", "?");
        Request request4 = new Request("Ala ma kota 420", "trimNumbers");
        System.out.println(procChain.processRequest(request0));
        System.out.println(procChain.processRequest(request1));
        System.out.println(procChain.processRequest(request2));
        System.out.println(procChain.processRequest(request3));
        System.out.println(procChain.processRequest(request4));
    }
}
