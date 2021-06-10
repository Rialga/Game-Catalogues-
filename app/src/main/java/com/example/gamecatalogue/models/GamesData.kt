package com.example.gamecatalogue.models

import com.example.gamecatalogue.R
import java.util.ArrayList

object GamesData {

    private val gameId = arrayOf(
        "de",
        "mele",
        "ths",
        "itt",
        "sm3d",
        "fez",
        "gxg",
        "rc",
        "smr",
        "mhr",
    )

    private val gamePhoto = intArrayOf(
        R.drawable.de,
        R.drawable.mele,
        R.drawable.ths,
        R.drawable.itt,
        R.drawable.sm3d,
        R.drawable.fez,
        R.drawable.gxg,
        R.drawable.rc,
        R.drawable.smr,
        R.drawable.mhr,
    )


    private val gameName = arrayOf(
        "Disco Elysium: Final CutDisco Elysium: Final Cut",
        "Mass Effect Legendary Edition",
        "Tony Hawk's Pro Skater 1 + 2",
        "It Takes Two",
        "Super Mario 3D World + Browser Fury",
        "FEZ",
        "Guilty Gear -Strive-",
        "Ratchet & Clank: Rift Apart",
        "Sumire",
        "Monster Hunter Rise",
    )

    private val gamePublisher = arrayOf(
        "ZA/UM",
        "Electronic Arts",
        "Activision",
        "Hazelight Studios",
        "Nintendo",
        "Polytron Corporation, Trapdoor, Xbox Game Studios",
        "Arc System Works, BANDAI NAMCO Entertainment Europe, Sega",
        "Sony Interactive Entertainment",
        "GameTomo",
        "Capcom, Capcom U.S.A., Inc.",
    )

    private  val gameDate = arrayOf(
        "March 30,  2021",
        "May 14, 2021",
        "March 26, 21",
        "March 22, 2021",
        "February 21, 2021",
        "April 14, 2021",
        "June 8, 2021",
        "June 11, 2021",
        "May 27, 2021",
        "March 26, 2021",
    )

    private  val gameGenre= arrayOf(
        "Role-Playiing",
        "Action role-playing game, Third-person shooter",
        "Sport",
        "Platform game, Puzzle Video Game, Action-adventure game, Adventure",
        "Platformer",
        "Platformer",
        "Fighting, Action Game",
        "Platformer, third-person shooter",
        "Adventure game, Indie game",
        "Role-Playing",
    )

    private  val gamePlatforms= arrayOf(
        "Microsoft Windows, macOS, PlayStation 4, PlayStation 5, Stadia, Nintendo Switch, Xbox One, Xbox Series X/S",
        "PlayStation 4, Xbox One, Microsoft Windows",
        "Nintendo Switch, PlayStation 4, PlayStation 5, Xbox One, Xbox Series X and Series S, Microsoft Windows",
        "PlayStation 4, Xbox One, PlayStation 5, Xbox Series X and Series S, Microsoft Windows",
        "Wii U,Switch",
        "Wii, Switch",
        "PlayStation 5",
        "PlayStation 5",
        "Nintendo Switch, Microsoft Windows",
        "Switch",
    )

    private  val gameDesc= arrayOf(
        "Disco Elysium - The Final Cut is the definitive edition of the smash-hit RPG. Pursue your political dreams in new quests, meet and question more of the city's locals, and explore a whole extra area. Full voice-acting, controller support, and expanded language options also included. Get even more out of this award-winning open world. You're a detective with a unique skill system at your disposal and a whole city block to carve your path across. Interrogate unforgettable characters, crack murders, or take bribes. Become a hero or an absolute disaster of a human being.",
        "For many months now, our team at BioWare has been hard at work updating the textures, shaders, models, effects and technical features of three enormous games. Our goal was not to remake or reimagine the original games, but to modernize the experience so that fans and new players can experience the original work in its best possible form. It's been amazing to see the adventures of Commander Shepard take on new life in super-sharp resolution, faster framerates, and beautiful visual enhancements. Mass Effect Legendary Edition will include single-player base content and DLC from Mass Effect, Mass Effect 2, and Mass Effect 3, plus promo weapons, armors, and packs - all remastered and optimized for 4k Ultra HD. It will be available in Spring 2021 for Xbox One, PlayStation 4, and PC, with forward compatibility and targeted enhancements on Xbox Series X and PlayStation 5.",
        "Drop back in with the most iconic skateboarding games ever made. Play Tony Hawk's Pro Skater & Tony Hawk's Pro Skater 2 in one epic collection, rebuilt from the ground up in incredible HD. All the pro skaters, levels and tricks are back and fully-remastered, plus more. Skate in super crisp 120 FPS at 1080P or 60 FPS in native 4K. Watch the levels come to life using sharper dynamic shadows, reflections, and lens flare, plus enhanced skater textures. The PS5 enhancements don’t stop at audio and visual upgrades, either. Major features include: 120 FPS @1080p Native 4k @60FPS SSD & Immediacy Haptic feedback via the DualSense wireless controller Spatialized Audio High Fidelity Atmospherics Activities and Game Help Cross-Gen Progression",
        "From Hazelight comes It Takes Two an innovative co-op adventure where uniquely varied gameplay and emotional storytelling intertwine in a fantastical journey. Founded to push the creative boundaries of what's possible in games, Hazelight is the award-winning studio behind the critically acclaimed A Way Out and Brothers: A Tale of Two Sons. Something out of the ordinary Bring your favorite co-op partner and together step into the shoes of May and Cody. As the couple is going through a divorce, through unknown means their minds are transported into two dolls which their daughter, Rose, made to represent them. Now they must reluctantly find a way to get back into their bodies, a quest which takes them through the most wild, unexpected and fantastical journey imaginable.",
        "The cat's out of the bag, Super Mario 3D World is on to the Nintendo Switch system. Pounce and climb through dozens of colorful stages! Mario (and his friends) can use power-ups like the Super Bell, which grants catlike abilities, like climbing and scratching. Work together locally or online with up to three other players to reach the goaland to see who can get a high score. The Super Mario 3D World + Bowser's Fury game features the same great co-op gameplay, creative levels and power-ups as the original game, but also so much more.",
        "Gomez is a 2D man on a voyage of discovery into the mysterious 3rd dimension. Change your perspective and look at the world in a different way",
        "Guilty Gear -Strive- is the latest entry in the Guilty Gear fighting game franchise. Created by Daisuke Ishiwatari and developed by Arc System Works, “Guilty Gear -Strive-“ upholds the series’ reputation for groundbreaking hybrid 2D/3D cell-shaded graphics and intense, rewarding gameplay. There is a fully voiced story mode diving deep into the Guilty Gear universe, new characters joining fan favorites, and robust rollback net code. The cutting-edge 2D/3D hybrid graphics pioneered in the Guilty Gear series have been raised to the next level in “Guilty Gear -Strive-“. The new artistic direction and improve character animations will go beyond anything you’ve seen before in a fighting game!",
        "Ratchet & Clank: Rift Apart is an intergalactic adventure from Insomniac Games that showcases what’s possible for games designed around PS5’s SSD and DualSense wireless controller. Players seamlessly travel through different dimensions in mid-gameplay. The DualSense wireless controller brings combat to life, with haptic feedback and the adaptive triggers adding powerful sensations that increase immersion in combat.",
        "One Day, One Life. Embark on a mysterious journey to help Sumire achieve her deepest wishes, before the day ends and the sky turns to twilight. Sumire is an indie narrative adventure, featuring a one-day journey through a picturesque Japanese village. In this enchanted place, a disenchanted girl named Sumire meets a mischievous spirit who makes her a deal to fulfill her most desired wish. But in order to see this wish come true, she must complete a series of tasks in return, before night falls and this special day reaches its end.",
        "Rise to the challenge and join the hunt. The action-RPG series returns to the Nintendo Switch! Set in the ninja-inspired land of Kamura Village, explore lush ecosystems and battle fearsome monsters to become the ultimate hunter. It's been half a century since the last calamity struck, but a terrifying new monster has reared its head and threatens to plunge the land into chaos once again. Hunt solo or in a party with friends to earn rewards that you can use to craft a huge variety of weapons and armor. Brand new gameplay systems such as the high-flying 'Wire Action' and your canine companion 'Palamute' will add exciting new layers to the already robust combat that Monster Hunter is known for. Whether it's at home, on the go, online or offline - you'll always be ready for your next hunt on the Nintendo Switch!",
    )

    private  val gameRating = intArrayOf(
        96,
        90,
        90,
        89,
        89,
        89,
        89,
        89,
        89,
        88
    )

    private  val gameCategories= intArrayOf(
        R.drawable.m,
        R.drawable.m,
        R.drawable.e,
        R.drawable.t,
        R.drawable.e,
        R.drawable.e,
        R.drawable.t,
        R.drawable.e,
        R.drawable.t,
        R.drawable.rp,
    )

    private  val gameLink= arrayOf(
        "https://youtu.be/YV2lp6pgXw",
        "https://youtu.be/n8i53TtQ6IQ",
        "https://youtu.be/A1k6wKa702o",
        "https://youtu.be/l5DmoxfR52M",
        "https://youtu.be/OPAQA_P_RQY",
        "https://youtu.be/lrEsNI0aCPk",
        "https://youtu.be/-rbffP5aQoA",
        "https://youtu.be/ai3o0XtrnM8",
        "https://youtu.be/q-7BW1myUns",
        "https://youtu.be/a6C5lH5b-f4",
    )

    val listGame : ArrayList<ModelGame>
        get() {
            val list = arrayListOf<ModelGame>()
            for(position in gameId.indices){
                val modelGame = ModelGame()
                modelGame.id = gameId[position]
                modelGame.photo = gamePhoto[position]
                modelGame.name = gameName[position]
                modelGame.date = gameDate[position]
                modelGame.genre = gameGenre[position]
                modelGame.publisher = gamePublisher[position]
                modelGame.platforms = gamePlatforms[position]
                modelGame.desc = gameDesc[position]
                modelGame.rating = gameRating[position]
                modelGame.categories = gameCategories[position]
                modelGame.link = gameLink[position]
                list.add(modelGame)
            }

            return list
        }



}