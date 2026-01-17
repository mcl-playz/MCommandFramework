package org.jasperdev.mcommandframework;

import org.jasperdev.mcommandframework.models.OptionData;
import org.jasperdev.mcommandframework.tree.MCmdNode;

import java.util.List;
import java.util.function.Supplier;

public class Utils {
	public static MCmdNode node(String name, String desc) {
		return new MCmdNode(name, desc);
	}

	public static MCmdNode arg(String name, String desc, OptionData.OptionType type) {
		return new MCmdNode(new OptionData(name, desc, type));
	}
	public static MCmdNode arg(String name, String desc, List<String> choices) {
		return new MCmdNode(new OptionData(name, desc, choices));
	}
	public static MCmdNode arg(String name, String desc, Supplier<List<String>> dynamicChoices) {
		return new MCmdNode(new OptionData(name, desc, dynamicChoices));
	}
}
