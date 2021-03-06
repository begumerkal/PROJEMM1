package io.anuke.mindustry.content;

import io.anuke.mindustry.game.ContentList;
import io.anuke.mindustry.type.Loadout;

public class Loadouts implements ContentList{
    public static Loadout
    basicShard,
    basicFoundation,
    basicNucleus;

    @Override
    public void load(){
        basicShard = new Loadout(
        "  ###  ",
        "  #1#  ",
        "  ###  ",
        "  ^ ^  ",
        " ## ## ",
        " C# C# "
        );

        basicFoundation = new Loadout(
        "  ####  ",
        "  ####  ",
        "  #2##  ",
        "  ####  ",
        "  ^  ^  ",
        " ##  ## ",
        " C#  C# "
        );

        basicNucleus = new Loadout(
        "  #####  ",
        "  #####  ",
        "  ##3##  ",
        "  #####  ",
        " >#####< ",
        " ^ ^ ^ ^ ",
        "#### ####",
        "C#C# C#C#"
        );
    }
}
