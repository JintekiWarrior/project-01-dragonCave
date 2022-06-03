public class StoryGame {
    public String storyStart()
    {
        return "You are in aland full of dragons. In front of you, you see two caves.\n" +
                "In one cave, the dragon is friendly and will share his treasure with you. The other\n" +
                "dragon is greedy and hungry and will eat you on sight. Which cave will you go into?\n" +
                "(1 or 2) Type answer below";
    }

    public String endingOne()
    {
        return "You approach the cave...\n" +
                "It is dark and spooky...\n" +
                "A large dragon jumps out in front of you! He opens his jaws and..\n" +
                "Gobbles you down in one bite!";
    }

    public String endingTwo()
    {
        return "You approach the cave...\n" +
                "It is dark and spooky...\n" +
                "A large dragon jumps out in front of you! He opens his jaws and..\n" +
                "Hands you all of the treasure.";
    }

    public String chooseEnding(int num)
    {
        if (num == 1)
        {
            return this.endingOne();
        } else if (num == 2)
        {
            return this.endingTwo();
        } else
        {
            return "No choice was made so you die of old age.";
        }
    }
}

