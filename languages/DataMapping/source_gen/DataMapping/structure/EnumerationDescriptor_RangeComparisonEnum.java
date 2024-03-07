package DataMapping.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import jetbrains.mps.lang.smodel.EnumerationLiteralsIndex;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class EnumerationDescriptor_RangeComparisonEnum extends EnumerationDescriptorBase {

  public EnumerationDescriptor_RangeComparisonEnum() {
    super(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x3d4dcd0802563681L, "RangeComparisonEnum", "r:2d36f7b5-27c5-4304-ac9a-34504b59f0d2(DataMapping.structure)/4417412243802961537");
  }

  private final EnumerationDescriptor.MemberDescriptor myMember_RangeStart_0 = new EnumerationDescriptor.MemberDescriptor("RangeStart", "Időszak eleje", 0x3d4dcd0802563682L, "r:2d36f7b5-27c5-4304-ac9a-34504b59f0d2(DataMapping.structure)/4417412243802961538");
  private final EnumerationDescriptor.MemberDescriptor myMember_RangeEnd_0 = new EnumerationDescriptor.MemberDescriptor("RangeEnd", "Időszak vége", 0x3d4dcd0802563683L, "r:2d36f7b5-27c5-4304-ac9a-34504b59f0d2(DataMapping.structure)/4417412243802961539");
  private final EnumerationDescriptor.MemberDescriptor myMember_Overlap_0 = new EnumerationDescriptor.MemberDescriptor("Overlap", "Átfedés", 0x3d4dcd0802563686L, "r:2d36f7b5-27c5-4304-ac9a-34504b59f0d2(DataMapping.structure)/4417412243802961542");

  private final EnumerationLiteralsIndex myIndex = EnumerationLiteralsIndex.build(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0x3d4dcd0802563681L, 0x3d4dcd0802563682L, 0x3d4dcd0802563683L, 0x3d4dcd0802563686L);
  private final List<EnumerationDescriptor.MemberDescriptor> myMembers = new EnumerationDescriptorBase.MembersList(myIndex, myMember_RangeStart_0, myMember_RangeEnd_0, myMember_Overlap_0);

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getDefault() {
    return null;
  }

  @NotNull
  @Override
  public List<EnumerationDescriptor.MemberDescriptor> getMembers() {
    return myMembers;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(@Nullable String memberName) {
    if (memberName == null) {
      return null;
    }
    switch (memberName) {
      case "RangeStart":
        return myMember_RangeStart_0;
      case "RangeEnd":
        return myMember_RangeEnd_0;
      case "Overlap":
        return myMember_Overlap_0;
    }
    return null;
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(long idValue) {
    int index = myIndex.index(idValue);
    if (index == -1) {
      return null;
    }
    return myMembers.get(index);
  }
}