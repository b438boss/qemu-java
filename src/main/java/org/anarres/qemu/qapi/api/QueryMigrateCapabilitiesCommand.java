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
 * <p><pre>QApiCommandDescriptor{name=query-migrate-capabilities, returns=[MigrationCapabilityStatus], data=null}</pre></p>
 */
// QApiCommandDescriptor{name=query-migrate-capabilities, returns=[MigrationCapabilityStatus], data=null}
public class QueryMigrateCapabilitiesCommand extends QApiCommand<Void, QueryMigrateCapabilitiesCommand.Response> {

	/** Response to a QueryMigrateCapabilitiesCommand. */
	public static class Response extends QApiResponse<List<MigrationCapabilityStatus>> {
	}

	/** Constructs a new QueryMigrateCapabilitiesCommand. */
	public QueryMigrateCapabilitiesCommand() {
		super("query-migrate-capabilities", Response.class, null);
	}
}
