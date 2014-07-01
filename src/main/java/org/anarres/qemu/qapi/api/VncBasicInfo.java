package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiTypeDescriptor{name=VncBasicInfo, data={host=str, service=str, family=NetworkAddressFamily}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=VncBasicInfo, data={host=str, service=str, family=NetworkAddressFamily}, innerTypes=null}
public class VncBasicInfo extends QApiType {

	@SerializedName("host")
	@Nonnull public String host;
	@SerializedName("service")
	@Nonnull public String service;
	@SerializedName("family")
	@Nonnull public NetworkAddressFamily family;
}
