package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-cpu-definitions, returns=[CpuDefinitionInfo], data=null}
public class QueryCpuDefinitionsCommand extends QApiCommand<Void, QueryCpuDefinitionsCommand.Response> {

	public static class Response extends QApiResponse<List<CpuDefinitionInfo>> {
	}

	public QueryCpuDefinitionsCommand() {
		super("query-cpu-definitions", Response.class, null);
	}
}