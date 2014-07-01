package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-fdsets, returns=[FdsetInfo], data=null}
public class QueryFdsetsCommand extends QApiCommand<Void, QueryFdsetsCommand.Response> {

	public static class Response extends QApiResponse<List<FdsetInfo>> {
	}

	public QueryFdsetsCommand() {
		super("query-fdsets", Response.class, null);
	}
}