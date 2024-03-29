package DataMapping.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import jetbrains.mps.lang.smodel.EnumerationLiteralsIndex;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;

public class EnumerationDescriptor_CSVFieldSeparator extends EnumerationDescriptorBase {

  public EnumerationDescriptor_CSVFieldSeparator() {
    super(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0xd79bf50eeae473aL, "CSVFieldSeparator", "r:2d36f7b5-27c5-4304-ac9a-34504b59f0d2(DataMapping.structure)/971017548997740346");
  }

  private final EnumerationDescriptor.MemberDescriptor myMember_comma_0 = new EnumerationDescriptor.MemberDescriptor("comma", "vessző (,)", 0xd79bf50eeae473bL, "r:2d36f7b5-27c5-4304-ac9a-34504b59f0d2(DataMapping.structure)/971017548997740347");
  private final EnumerationDescriptor.MemberDescriptor myMember_semicolon_0 = new EnumerationDescriptor.MemberDescriptor("semicolon", "pontosvessző (;)", 0xd79bf50eeae473cL, "r:2d36f7b5-27c5-4304-ac9a-34504b59f0d2(DataMapping.structure)/971017548997740348");
  private final EnumerationDescriptor.MemberDescriptor myMember_tab_0 = new EnumerationDescriptor.MemberDescriptor("tab", "tabulátor", 0xd79bf50eeae473fL, "r:2d36f7b5-27c5-4304-ac9a-34504b59f0d2(DataMapping.structure)/971017548997740351");
  private final EnumerationDescriptor.MemberDescriptor myMember_pipe_0 = new EnumerationDescriptor.MemberDescriptor("pipe", "\"pipe\" karakter (|)", 0xd79bf50eeae4743L, "r:2d36f7b5-27c5-4304-ac9a-34504b59f0d2(DataMapping.structure)/971017548997740355");

  private final EnumerationLiteralsIndex myIndex = EnumerationLiteralsIndex.build(0x22a6c585e3ba46bcL, 0x922caa7eb0f6869bL, 0xd79bf50eeae473aL, 0xd79bf50eeae473bL, 0xd79bf50eeae473cL, 0xd79bf50eeae473fL, 0xd79bf50eeae4743L);
  private final List<EnumerationDescriptor.MemberDescriptor> myMembers = new EnumerationDescriptorBase.MembersList(myIndex, myMember_comma_0, myMember_semicolon_0, myMember_tab_0, myMember_pipe_0);

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getDefault() {
    return myMember_semicolon_0;
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
      case "comma":
        return myMember_comma_0;
      case "semicolon":
        return myMember_semicolon_0;
      case "tab":
        return myMember_tab_0;
      case "pipe":
        return myMember_pipe_0;
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
