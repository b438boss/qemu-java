package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

// QApiTypeDescriptor{name=ChardevRingbuf, data={*size=int}, innerTypes=null}
public class ChardevRingbuf extends QApiType {

	@SerializedName("size")
	@CheckForNull public long size;
}