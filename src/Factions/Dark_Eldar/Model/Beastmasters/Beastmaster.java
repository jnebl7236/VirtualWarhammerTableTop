package Factions.Dark_Eldar.Model.Beastmasters;

import Factions.Dark_Eldar.Base.DarkEldarModel;

/**
 * Created by jnebl on 4/9/2017.
 */
public class Beastmaster extends DarkEldarModel{
    public Beastmaster(){
        super(4,4,3,3,1,6,1,8,5,"Beastmaster","In the arenas of " +
                "Commorragh, the wild hunts of the Beastmasters are always\n" +
                "popular. Packs of beasts stalk their prey amid the screams of the crowd, bound to the\n" +
                "commands of the figures that drift above them. Some believe that Beastmasters are part\n" +
                "of a secretive shamanic tradition, for when they go to battle, they wear masks that echo\n" +
                "the nature of the alien predators under their control. These potent artefacts harbour\n" +
                "sonic emitters and pheromone traps, magnifying the Beastmasters’ dominance over their\n" +
                "packs. When accompanying a realspace raid, Beastmasters hover upon modified\n" +
                "skyboards, goading their charges into the fray. From the otherworldly Khymerae and\n" +
                "swirling, bone-hungry Razorwing Flocks to the berserk rage of the towering Donorian\n" +
                "Clawed Fiend, the Beastmasters’ monstrous pets are deadly indeed.",10);
        setFastAttack(true);
        setBeasts(true);
        setNightVision(true);
        setPowerFromPain(true);
    }
}
