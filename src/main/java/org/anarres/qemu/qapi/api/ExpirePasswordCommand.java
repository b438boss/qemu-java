package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=expire_password, returns=null, data={protocol=str, time=str}}
public class ExpirePasswordCommand extends QApiCommand<ExpirePasswordCommand.Arguments, ExpirePasswordCommand.Response> {
	public static class Arguments {
		@SerializedName("protocol")
		@Nonnull public String protocol;
		@SerializedName("time")
		@Nonnull public String time;
	}

	public static class Response extends QApiResponse<Void> {
	}

	public ExpirePasswordCommand(@Nonnull ExpirePasswordCommand.Arguments argument) {
		super("expire_password", Response.class, argument);
	}
}