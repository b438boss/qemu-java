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
 * <p><pre>QApiCommandDescriptor{name=query-tpm, returns=[TPMInfo], data=null}</pre></p>
 */
// QApiCommandDescriptor{name=query-tpm, returns=[TPMInfo], data=null}
public class QueryTpmCommand extends QApiCommand<Void, QueryTpmCommand.Response> {

	/** Response to a QueryTpmCommand. */
	public static class Response extends QApiResponse<List<TPMInfo>> {
	}

	/** Constructs a new QueryTpmCommand. */
	public QueryTpmCommand() {
		super("query-tpm", Response.class, null);
	}
}
