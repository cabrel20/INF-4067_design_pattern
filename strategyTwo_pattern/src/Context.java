public class Context {
    private Compressor compressor;
    private Filter filter;

    public Context(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(){
        compressor.compressor();
        filter.apply();
        System.out.println("Image sauvegarder...");
    }
}
