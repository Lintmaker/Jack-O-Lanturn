public class JackOLanturn
{
    private String [][] face;
    public JackOLanturn(String [] [] face)
    {
        this.face = face;
    }
    public  void fill (String str)
    {
        for(int i = 0; i < face.length; i++)
        {
            for( int x = 0; x < face[i].length; x++)
            {
                face[i][x] = (str);
            }
        }
    }

    public void edit(String replace, int row, int column)
    {
        face[row][column] = replace;
    }

    @Override
    public String toString()
    {
        String string = "";
        for(int i = 0; i < face.length; i++)
        {
            for( int x = 0; x < face[i].length; x++)
            {
                string += face[i][x];
            }
            string = string + "\n";
        }
        return string;
    }
}
