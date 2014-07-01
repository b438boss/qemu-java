package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=change-vnc-password, returns=null, data={password=str}}</pre></p>
 */
// QApiCommandDescriptor{name=change-vnc-password, returns=null, data={password=str}}
public class ChangeVncPasswordCommand extends QApiCommand<ChangeVncPasswordCommand.Arguments, ChangeVncPasswordCommand.Response> {
	/** Compound arguments to a ChangeVncPasswordCommand. */
	public static class Arguments {
		@SerializedName("password")
		@Nonnull public String password;
	}

	/** Response to a ChangeVncPasswordCommand. */
	public static class Response extends QApiResponse<Void> {
	}

	/** Constructs a new ChangeVncPasswordCommand. */
	public ChangeVncPasswordCommand(@Nonnull ChangeVncPasswordCommand.Arguments argument) {
		super("change-vnc-password", Response.class, argument);
	}
}
