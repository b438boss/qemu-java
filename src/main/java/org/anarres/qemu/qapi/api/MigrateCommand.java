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
 * <p><pre>QApiCommandDescriptor{name=migrate, returns=null, data={uri=str, *blk=bool, *inc=bool, *detach=bool}}</pre></p>
 */
// QApiCommandDescriptor{name=migrate, returns=null, data={uri=str, *blk=bool, *inc=bool, *detach=bool}}
public class MigrateCommand extends QApiCommand<MigrateCommand.Arguments, MigrateCommand.Response> {
	/** Compound arguments to a MigrateCommand. */
	public static class Arguments {
		@SerializedName("uri")
		@Nonnull public String uri;
		@SerializedName("blk")
		@CheckForNull public boolean blk;
		@SerializedName("inc")
		@CheckForNull public boolean inc;
		@SerializedName("detach")
		@CheckForNull public boolean detach;
	}

	/** Response to a MigrateCommand. */
	public static class Response extends QApiResponse<Void> {
	}

	/** Constructs a new MigrateCommand. */
	public MigrateCommand(@Nonnull MigrateCommand.Arguments argument) {
		super("migrate", Response.class, argument);
	}
}
