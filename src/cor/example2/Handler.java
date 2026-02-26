package cor.example2;


public abstract class Handler {
    private Handler next;

    public void approve(Req req) {
        if (req.getLevel() == this.getLevel()) {
            this.process(req);
        } else {
            this.next.approve(req);
        }
    }

    public void setNext(Handler handler) {
        this.next = handler;
    }

    protected abstract int getLevel();

    protected abstract void process(Req req);
}
