public class Runner
{
    public static void main (String [] args)
    {
        String[][] face = new String[5][8];
        JackOLanturn face1 = new JackOLanturn(face);
        face1.fill("X");
        face1.edit("", 0, 0);
        face1.edit("", 0, 0);
        face1.edit("", 0, 0);
        face1.edit("", 0, 0);

        face1.edit("0", 0, 0);
        face1.edit("0", 0, 0);
        face1.edit("^", 0, 0);
        face1.edit("^", 0, 0);
        face1.edit("|", 0, 0);
        face1.edit("|", 0, 0);
        face1.edit("_", 0, 0);
        face1.edit("_", 0, 0);
        face1.edit("|", 0, 0);
        face1.edit("|", 0, 0);
        System.out.println(face1);

    }
}
