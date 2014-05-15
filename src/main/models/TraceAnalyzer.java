// Date: 5/15/2014 6:53:28 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.minecraft.src;

public class ModelTraceAnalyzer extends ModelBase
{
  //fields
    ModelRenderer OuterWall;
    ModelRenderer InnerWall;
    ModelRenderer Fragment;
  
  public ModelTraceAnalyzer()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      OuterWall = new ModelRenderer(this, 0, 24);
      OuterWall.addBox(-8F, -8F, -8F, 16, 16, 16);
      OuterWall.setRotationPoint(0F, 16F, 0F);
      OuterWall.setTextureSize(64, 64);
      OuterWall.mirror = true;
      setRotation(OuterWall, 0F, 0F, 0F);
      InnerWall = new ModelRenderer(this, 0, 0);
      InnerWall.addBox(0F, 0F, 0F, 12, 12, 12);
      InnerWall.setRotationPoint(-6F, 10F, -6F);
      InnerWall.setTextureSize(64, 64);
      InnerWall.mirror = true;
      setRotation(InnerWall, 0F, 0F, 0F);
      Fragment = new ModelRenderer(this, 36, 0);
      Fragment.addBox(-3F, -3F, -3F, 6, 6, 6);
      Fragment.setRotationPoint(0F, 16F, 0F);
      Fragment.setTextureSize(64, 64);
      Fragment.mirror = true;
      setRotation(Fragment, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    OuterWall.render(f5);
    InnerWall.render(f5);
    Fragment.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5);
  }

}
