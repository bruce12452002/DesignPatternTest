package cor.example2;


public abstract class Handler {
    private Handler handler;

    public void approve(Req req) {
        if (req.getLevel() == this.getLevel()) {
            this.process(req);
        } else {
            this.handler.approve(req);
        }
    }

    public void setNext(Handler handler) {
        this.handler = handler;
    }

    protected abstract int getLevel();

    protected abstract void process(Req req);
}
