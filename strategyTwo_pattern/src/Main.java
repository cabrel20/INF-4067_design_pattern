public class Main {
    public static void main(String[] args) {

        Compressor compressor = new PngCompressor();
        Filter filter = new BlackAndWhiteFilter();
        Context context = new Context(compressor,filter);
        context.store();
    }
}