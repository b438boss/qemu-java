package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <pre>QApiUnionDescriptor{name=CpuInfo, discriminator=arch, data={x86=CpuInfoX86, sparc=CpuInfoSPARC, ppc=CpuInfoPPC, mips=CpuInfoMIPS, tricore=CpuInfoTricore, other=CpuInfoOther}, innerTypes=null, fields=null, base={CPU=int, current=bool, halted=bool, qom_path=str, thread_id=int, *props=CpuInstanceProperties, arch=CpuInfoArch}, discriminatorField=null}</pre>
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CpuInfo extends CpuInfoBase implements QApiUnion {

	// union {
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("x86")
	@JsonUnwrapped
	@CheckForNull
	public CpuInfoX86 x86;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("sparc")
	@JsonUnwrapped
	@CheckForNull
	public CpuInfoSPARC sparc;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("ppc")
	@JsonUnwrapped
	@CheckForNull
	public CpuInfoPPC ppc;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("mips")
	@JsonUnwrapped
	@CheckForNull
	public CpuInfoMIPS mips;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("tricore")
	@JsonUnwrapped
	@CheckForNull
	public CpuInfoTricore tricore;
	@SuppressFBWarnings("NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
	@JsonProperty("other")
	@JsonUnwrapped
	@CheckForNull
	public CpuInfoOther other;
	// }

	@Nonnull
	public static CpuInfo x86(@Nonnull CpuInfoX86 x86) {
		CpuInfo self = new CpuInfo();
		self.arch = CpuInfoArch.x86;
		self.x86 = x86;
		return self;
	}

	@Nonnull
	public static CpuInfo sparc(@Nonnull CpuInfoSPARC sparc) {
		CpuInfo self = new CpuInfo();
		self.arch = CpuInfoArch.sparc;
		self.sparc = sparc;
		return self;
	}

	@Nonnull
	public static CpuInfo ppc(@Nonnull CpuInfoPPC ppc) {
		CpuInfo self = new CpuInfo();
		self.arch = CpuInfoArch.ppc;
		self.ppc = ppc;
		return self;
	}

	@Nonnull
	public static CpuInfo mips(@Nonnull CpuInfoMIPS mips) {
		CpuInfo self = new CpuInfo();
		self.arch = CpuInfoArch.mips;
		self.mips = mips;
		return self;
	}

	@Nonnull
	public static CpuInfo tricore(@Nonnull CpuInfoTricore tricore) {
		CpuInfo self = new CpuInfo();
		self.arch = CpuInfoArch.tricore;
		self.tricore = tricore;
		return self;
	}

	@Nonnull
	public static CpuInfo other(@Nonnull CpuInfoOther other) {
		CpuInfo self = new CpuInfo();
		self.arch = CpuInfoArch.other;
		self.other = other;
		return self;
	}

	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("x86");
		names.add("sparc");
		names.add("ppc");
		names.add("mips");
		names.add("tricore");
		names.add("other");
		return names;
	}

	@JsonIgnore
	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("x86".equals(name))
			return x86;
		if ("sparc".equals(name))
			return sparc;
		if ("ppc".equals(name))
			return ppc;
		if ("mips".equals(name))
			return mips;
		if ("tricore".equals(name))
			return tricore;
		if ("other".equals(name))
			return other;
		return super.getFieldByName(name);
	}

	@JsonIgnore
	public boolean isValidUnion() {
		int count = 0;
		if (x86 != null)
			count++;
		if (sparc != null)
			count++;
		if (ppc != null)
			count++;
		if (mips != null)
			count++;
		if (tricore != null)
			count++;
		if (other != null)
			count++;
		return (count == 1);
	}
}
