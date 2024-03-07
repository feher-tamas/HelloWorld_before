package DataMapping.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.SNodePointer;
import java.util.HashMap;
import org.jetbrains.mps.openapi.language.SInterfaceConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class IParamRef_Constraints extends BaseConstraintsDescriptor {
  public IParamRef_Constraints() {
    super(CONCEPTS.IParamRef$yT);
  }

  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    BaseReferenceConstraintsDescriptor d0 = new BaseReferenceConstraintsDescriptor(LINKS.param$43xU, this, true, false) {
      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return ReferenceScopeProvider.fromHierarchy(CONCEPTS.IParamRef$yT, new SNodePointer("r:ca12430d-bb8b-4b60-b669-303893ccb47b(DataMapping.constraints)", "8046702935278354401"));
      }
    };
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(d0.getReference(), d0);
    return references;
  }

  private static final class CONCEPTS {
    /*package*/ static final SInterfaceConcept IParamRef$yT = MetaAdapterFactory.getInterfaceConcept(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x1c06662da7304013L, "DataMapping.structure.IParamRef");
  }

  private static final class LINKS {
    /*package*/ static final SReferenceLink param$43xU = MetaAdapterFactory.getReferenceLink(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x1c06662da7304013L, 0x1c06662da7304016L, "param");
  }
}
