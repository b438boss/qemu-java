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
 * <p><pre>QApiCommandDescriptor{name=xen-set-global-dirty-log, returns=null, data={enable=bool}}</pre></p>
 */
// QApiCommandDescriptor{name=xen-set-global-dirty-log, returns=null, data={enable=bool}}
public class XenSetGlobalDirtyLogCommand extends QApiCommand<XenSetGlobalDirtyLogCommand.Arguments, XenSetGlobalDirtyLogCommand.Response> {
	/** Compound arguments to a XenSetGlobalDirtyLogCommand. */
	public static class Arguments {
		@SerializedName("enable")
		@Nonnull public boolean enable;
	}

	/** Response to a XenSetGlobalDirtyLogCommand. */
	public static class Response extends QApiResponse<Void> {
	}

	/** Constructs a new XenSetGlobalDirtyLogCommand. */
	public XenSetGlobalDirtyLogCommand(@Nonnull XenSetGlobalDirtyLogCommand.Arguments argument) {
		super("xen-set-global-dirty-log", Response.class, argument);
	}
}
