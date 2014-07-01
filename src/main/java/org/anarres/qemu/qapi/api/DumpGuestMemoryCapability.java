package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=DumpGuestMemoryCapability, data={formats=[DumpGuestMemoryFormat]}, innerTypes=null}
public class DumpGuestMemoryCapability extends QApiType {

	@SerializedName("formats")
	@Nonnull public List<DumpGuestMemoryFormat> formats;
}