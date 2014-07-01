package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiCommandDescriptor{name=migrate_cancel, returns=null, data=null}
public class MigrateCancelCommand extends QApiCommand<Void, MigrateCancelCommand.Response> {

	public static class Response extends QApiResponse<Void> {
	}

	public MigrateCancelCommand() {
		super("migrate_cancel", Response.class, null);
	}
}