public class Hello
{
    public static void main(String argv[])
    {
        //changed defualt to
        // Nixon :  And in all of my years of public life, I have never obstructed justice.
        // And I think, too, that I could say that in my years of public life,
        // that I welcome this kind of examination,
        // because people have got to know whether or not their President is a crook.
        // Well, I am not a crook. I have earned everything I have got.
        String name = "Nixon : And in all of my years of public life, I have never obstructed justice.\n" +
                " And I think, too, that I could say that in my years of public life,\n " +
                "that I welcome this kind of examination, because people have got to know \n" +
                "whether or not their President is a crook. Well, I am not a crook. \n" +
                " I have earned everything I have got."
        if (argv.length != 0)
        {
        name = argv[0];
        }
        //changed print output
        System.out.println(argv[0]);
        }
}