package PATRON_DE_STRUCTURATION.adapter_pattern;

public class Documentpdf implements Document {
    private ComposantPDF outilpdf;
    public Documentpdf(){
        this.outilpdf = new ComposantPDF();
    }

    public String setContenu(String contenu){
        outilpdf.pdfFixeContenu(contenu);
        return "contenu PDF : "+ contenu;
    }

    public String dessine(){
        return "dessine PDF";
    }

    public String imprime(String contenu){
        outilpdf.pdfEnvoieImprimante();
        return "imprime PDF";
    }
}