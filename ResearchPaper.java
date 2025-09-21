
public interface ResearchPaper {
    void view();

    
}
class FullResearchPaper implements ResearchPaper{
         String tittle;
    public FullResearchPaper(String tittle)
    {
        this.tittle=tittle;
    }
    @Override
    public void view(){
        System.out.println("View Full Research Paper"+tittle);
    }
}

class loadpdf implements ResearchPaper{
     FullResearchPaper fullResearchPaper;
     String tittle;

    public loadpdf(String tittle)
    {
        this.tittle=tittle;
        this.fullResearchPaper=null;
    }
    @Override
    public void view(){
        fullResearchPaper=new FullResearchPaper(tittle);
        fullResearchPaper.view();
    }
}
class Main{
    public static void main(String[] args) {
        loadpdf paper1=new loadpdf("Paper 1");
        loadpdf paper2=new loadpdf("Paper 2");
        loadpdf paper3=new loadpdf("Paper 3");
        paper1.view();
        paper2.view();
        paper3.view();
    }
}
