package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-commands, returns=[CommandInfo], data=null}
public class QueryCommandsCommand extends QApiCommand<Void, QueryCommandsCommand.Response> {

	public static class Response extends QApiResponse<List<CommandInfo>> {
	}

	public QueryCommandsCommand() {
		super("query-commands", Response.class, null);
	}
}