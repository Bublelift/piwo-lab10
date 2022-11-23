package pwo.lab10.chain;

public class TxtProcTrimNumbers extends TxtProc {

    public static String ACTION = "TRIMNUMBERS";

    @Override
    public String processRequest(Request request) {

        if (request.action.toUpperCase().equals(ACTION)) {
            return request.text.replaceAll("[0-9]", "");
        } else {
            return next(request);
        }
    }
}
