package yesseyyessey.yesblock;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.minecraft.client.MinecraftClient;

public class YesBlockClient implements ClientModInitializer {

	private void RegisterCommand(LiteralArgumentBuilder<FabricClientCommandSource> lab)
	{
		ClientCommandRegistrationCallback.EVENT.register(((dispatcher, idk) -> dispatcher.register(lab)));
	}

	private void RegisterCommandSimple(String name, Command<FabricClientCommandSource> cmd)
	{
		RegisterCommand(ClientCommandManager.literal(name).executes(cmd));
	}

	public static boolean SaveChunksOnHypixel = false; // Skyblock maps get weird only set to true when you're carefully recording chunks
	public static boolean FullGamma = false;

	@Override
	public void onInitializeClient() {
		RegisterCommandSimple("yesblockgamma", context -> {
			FullGamma = !FullGamma;
			MinecraftClient.getInstance().options.getGamma().setValue(FullGamma ? 999.0 : 1.0);
			return 0;
		});
	}
}