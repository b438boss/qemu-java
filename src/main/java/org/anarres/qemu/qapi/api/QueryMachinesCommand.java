package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=query-machines, returns=[MachineInfo], data=null}
public class QueryMachinesCommand extends QApiCommand<Void, QueryMachinesCommand.Response> {

	public static class Response extends QApiResponse<List<MachineInfo>> {
	}

	public QueryMachinesCommand() {
		super("query-machines", Response.class, null);
	}
}
