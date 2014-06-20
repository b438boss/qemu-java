package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-vnc, returns=VncInfo, data=null}
public class QueryVncCommand extends QApiCommand<Void, QueryVncCommand.Response> {

	public static class Response extends QApiResponse<VncInfo> {
	}

	public QueryVncCommand() {
		super("query-vnc", Response.class, null);
	}
}
