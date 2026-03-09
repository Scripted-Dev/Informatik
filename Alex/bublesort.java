public class bubblesort
{
    public static void main(String[] args)
    {
        int temp;
        int[] gr = {185, 175, 190, 170};
        
        for(int i=1; i<=gr.length; i++) //Zählschleife
        {
            for(int j=0; j<=gr.length-2; j++) //eigentlicher Sortieralgorithmus
            {
                if(gr[j] > gr[j+1])
                {
                    temp = gr[j+1];
                    gr[j+1] = gr[j];
                    gr[j] = temp;
                }
            }
        }
        
        for(int k=0; k<gr.length; k++) //Ausgabe der einzelnen Array-Elemente zur Überprüfung des Sortieralgorithmus'
        {
            System.out.println(gr[k]);
        }
    }
}