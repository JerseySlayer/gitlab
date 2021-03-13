public class Hello
{
    public static void main(String argv[])
    {
        // changed default to
        // Jules : What does Marsellus Wallace look like?
        //
        //Brett : What?
        //
        //Jules : What country are you from?
        //
        //Brett : What? What? Wh - ?
        //
        //Jules : "What" ain't no country I've ever heard of. They speak English in What?
        //
        //Brett : What?
        //
        //Jules : English, motherfucker, do you speak it?
        //
        //Brett : Yes! Yes!
        //
        //Jules : Then you know what I'm sayin'!
        //
        //Brett : Yes!
        //
        //Jules : Describe what Marsellus Wallace looks like!
        //
        //Brett : What?
        //
        //Jules : Say 'what' again. Say 'what' again, I dare you, I double dare you motherfucker, say what one more Goddamn time!
        String name = "Jules : What does Marsellus Wallace look like?\n" +
                "\n" +
                "Brett : What?\n" +
                "\n" +
                "Jules : What country are you from?\n" +
                "\n" +
                "Brett : What? What? Wh - ?\n" +
                "\n" +
                "Jules : \"What\" ain't no country I've ever heard of. They speak English in What?\n" +
                "\n" +
                "Brett : What?\n" +
                "\n" +
                "Jules : English, motherfucker, do you speak it?\n" +
                "\n" +
                "Brett : Yes! Yes!\n" +
                "\n" +
                "Jules : Then you know what I'm sayin'!\n" +
                "\n" +
                "Brett : Yes!\n" +
                "\n" +
                "Jules : Describe what Marsellus Wallace looks like!\n" +
                "\n" +
                "Brett : What?\n" +
                "\n" +
                "Jules : Say 'what' again. Say 'what' again, I dare you, I double dare you motherfucker, say what one more Goddamn time! ";
        if (argv.length != 0)
        {
            name = argv[0];
        }
        //changed print output
        System.out.println(argv[0]);
    }
}