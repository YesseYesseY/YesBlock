package yesseyyessey.yesblock;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.minecraft.client.MinecraftClient;
import net.minecraft.component.Component;

import java.util.ArrayList;
import java.util.List;

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
	public static int CurrentItemPage = 0;

	public static List<SkyblockItem> SBItems = new ArrayList<SkyblockItem>();

	@Override
	public void onInitializeClient() {
		try
		{
			String res = Http.Get("https://api.hypixel.net/v2/resources/skyblock/items");
			List<JsonElement> arr = JsonParser.parseString(res).getAsJsonObject().getAsJsonArray("items").asList();
			arr.forEach(jsonElement -> {
				SBItems.add(new SkyblockItem(jsonElement.getAsJsonObject()));
			});
		}
		catch (Exception e)
		{
			YesBlock.LOGGER.info("Failed to get items");
		}

		RegisterCommandSimple("yesblockgamma", context -> {
			FullGamma = !FullGamma;
			MinecraftClient.getInstance().options.getGamma().setValue(FullGamma ? 999.0 : 1.0);
			return 0;
		});

		RegisterCommandSimple("yesblockcomponents", context -> {
			Gson gson = new Gson();
			List<Component<?>> components = context.getSource().getPlayer().getMainHandStack().getComponents().stream().toList();
			for (Component<?> component : components) {
				YesBlock.LOGGER.info("---------------------------------------------------------------------------------------------");
				YesBlock.LOGGER.info(component.type().toString());
				YesBlock.LOGGER.info(component.value().toString());
			}
			YesBlock.LOGGER.info("---------------------------------------------------------------------------------------------");
			return 0;
		});
	}
}