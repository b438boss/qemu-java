package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiCommandDescriptor{name=query-gic-capabilities, returns=[GICCapability], data=null}</pre>
 */
// QApiCommandDescriptor{name=query-gic-capabilities, returns=[GICCapability], data=null}
public class QueryGicCapabilitiesCommand extends QApiCommand<java.lang.Void, QueryGicCapabilitiesCommand.Response> {

	/** Response to a QueryGicCapabilitiesCommand. */
	public static class Response extends QApiResponse<java.util.List<GICCapability>> {
	}

	/** Constructs a new QueryGicCapabilitiesCommand. */
	public QueryGicCapabilitiesCommand() {
		super("query-gic-capabilities", Response.class, null);
	}

}
