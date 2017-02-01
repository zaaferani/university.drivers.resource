package models;

public class ServiceResult {

    public enum ResultSet {
        OK,
        notOK,
        serverNotFound
    }

    private ResultSet result;
    private Object object;

    public ServiceResult() {
    }

    public ServiceResult(Object object) {
        this.object = object;
    }

    /**
     * @return the result
     */
    public ResultSet getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(ResultSet result) {
        this.result = result;
    }

    /**
     * @return the codeModel
     */
    public Object getModel() {
        return object;
    }

    /**
     * @param model the codeModel to set
     */
    public void setModel(Object model) {
        this.object = model;
    }
}
