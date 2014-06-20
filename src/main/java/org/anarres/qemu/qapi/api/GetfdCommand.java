package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=getfd, returns=null, data={fdname=str}}
public class GetfdCommand extends QApiCommand<GetfdCommand.GetfdArguments, GetfdCommand.Response> {
	public static class GetfdArguments {
		@SerializedName("fdname")
		@Nonnull public String fdname;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public GetfdCommand(@Nonnull GetfdCommand.GetfdArguments argument) {
		super("getfd", Response.class, argument);
	}
}
