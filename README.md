# ForgeMixin

A basic forge coremod demonstrating use of Sponge's [Mixin](https://github.com/spongepowered/mixin) with [FML](https://www.minecraftforge.net/).
You can use this as a base to build your own mod using Mixins.

Specifically, it hooks into `GuiMainMenu`'s constructor to force the main menu to display the Minceraft logo every time,

# Developing

Similar to any other forge mod. Setup a decompilation workspace:

```
  $ ./gradlew setupDecompWorkspace
```

Load into an IDE of your choice. You may then want to use `./gradlew ideaModule genIntellijRuns`



# License

This is licensed under the MIT License, as is Sponge's Mixin library.

Minecraft Forge is licensed under the LGPL v2.1