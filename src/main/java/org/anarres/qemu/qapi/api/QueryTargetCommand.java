package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-target, returns=TargetInfo, data=null}
public class QueryTargetCommand extends QApiCommand<Void, QueryTargetCommand.Response> {

	public static class Response extends QApiResponse<TargetInfo> {
	}

	public QueryTargetCommand() {
		super("query-target", Response.class, null);
	}
}