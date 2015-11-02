package com.httymd.client.model.dragon;

import com.httymd.client.model.ModelDragon;

import net.minecraft.client.model.ModelRenderer;

public class ModelDeadlyNadder extends ModelDragon {
	public ModelRenderer stomach;
	public ModelRenderer upperbody;
	public ModelRenderer tail1;
	public ModelRenderer tail2;
	public ModelRenderer tail3;
	public ModelRenderer tail4;
	public ModelRenderer tail5;
	public ModelRenderer tail6;
	public ModelRenderer leftclaw1;
	public ModelRenderer leftclaw2;
	public ModelRenderer leftclaw3;
	public ModelRenderer leftclaw4;
	public ModelRenderer leftclaw5;
	public ModelRenderer rightclaw1;
	public ModelRenderer rightclaw2;
	public ModelRenderer rightclaw3;
	public ModelRenderer rightclaw4;
	public ModelRenderer rightclaw5;

	public ModelRenderer cresthorn1;
	public ModelRenderer cresthorn2;
	public ModelRenderer cresthorn3;
	public ModelRenderer cresthorn4;
	public ModelRenderer cresthorn5;
	public ModelRenderer cresthorn6;
	public ModelRenderer cresthorn7;
	public ModelRenderer cresthorn8;
	public ModelRenderer cresthorn9;
	public ModelRenderer cresthorn10;
	public ModelRenderer cresthorn11;
	public ModelRenderer horn1;
	public ModelRenderer horn2;
	public ModelRenderer horn3;
	public ModelRenderer horn4;
	public ModelRenderer neck1;
	public ModelRenderer neck2;
	public ModelRenderer neck3;
	public ModelRenderer leftwing;
	public ModelRenderer rightwing;
	public ModelRenderer liftbicep;
	public ModelRenderer rightbicep;
	public ModelRenderer leftforearm;
	public ModelRenderer rightforearm;
	public ModelRenderer lefthook;
	public ModelRenderer righthook;
	public ModelRenderer spike1;
	public ModelRenderer spike2;
	public ModelRenderer spike3;
	public ModelRenderer spike4;
	public ModelRenderer spike5;
	public ModelRenderer spike6;

	public ModelDeadlyNadder() {
		this.textureWidth = 512;
		this.textureHeight = 256;

		this.leftclaw1 = new ModelRenderer(this, 0, 79);
		this.leftclaw1.setRotationPoint(6.0F, 22.0F, -13.0F);
		this.leftclaw1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 7, 0.0F);
		this.setRotation(leftclaw1, 0.0F, 0.34906584024429316F, 0.0F);
		this.rightclaw1 = new ModelRenderer(this, 0, 79);
		this.rightclaw1.setRotationPoint(-19.0F, 22.0F, -13.0F);
		this.rightclaw1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 7, 0.0F);
		this.setRotation(rightclaw1, 0.0F, 0.34906584024429316F, 0.0F);
		this.horn1 = new ModelRenderer(this, 0, 132);
		this.horn1.setRotationPoint(-2.5F, -37.0F, -53.0F);
		this.horn1.addBox(0.0F, -3.0F, 0.0F, 4, 3, 9, 0.0F);
		this.setRotation(horn1, -0.2617993950843811F, -0.0F, 0.0F);
		this.neck1 = new ModelRenderer(this, 473, 96);
		this.neck1.setRotationPoint(-6.0F, -35.0F, -36.0F);
		this.neck1.addBox(0.0F, 0.0F, 0.0F, 11, 9, 9, 0.0F);
		this.setRotation(neck1, -0.5235987901687622F, -0.0F, 0.0F);
		this.tail4 = new ModelRenderer(this, 276, 231);
		this.tail4.setRotationPoint(-3.0F, 0.0F, 58.0F);
		this.tail4.addBox(0.0F, 0.0F, 0.0F, 5, 5, 20, 0.0F);
		this.setRotation(tail4, -0.08726646006107329F, -0.0F, 0.0F);
		this.neck2 = new ModelRenderer(this, 479, 131);
		this.neck2.setRotationPoint(-6.0F, -27.0F, -23.0F);
		this.neck2.addBox(0.0F, 0.0F, 0.0F, 11, 10, 6, 0.0F);
		this.setRotation(neck2, -0.5235987901687622F, -0.0F, 0.0F);
		this.rightwing = new ModelRenderer(this, 0, 0);
		this.rightwing.setRotationPoint(-7.0F, -22.0F, -18.0F);
		this.rightwing.addBox(-110.0F, 0.0F, 0.0F, 110, 0, 60, 0.0F);
		this.leftclaw5 = new ModelRenderer(this, 0, 72);
		this.leftclaw5.setRotationPoint(12.0F, 16.0F, 3.0F);
		this.leftclaw5.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
		this.setRotation(leftclaw5, -0.43633231520652765F, -0.0F, 0.0F);
		this.cresthorn3 = new ModelRenderer(this, 0, 188);
		this.cresthorn3.setRotationPoint(4.0F, -38.0F, -37.0F);
		this.cresthorn3.addBox(-2.0F, 0.0F, 0.0F, 2, 2, 18, 0.0F);
		this.setRotation(cresthorn3, 0.43633231520652765F, 0.08726646006107329F, 0.0F);
		this.liftbicep = new ModelRenderer(this, 0, 106);
		this.liftbicep.setRotationPoint(7.0F, -23.0F, -17.0F);
		this.liftbicep.addBox(0.0F, 0.0F, 0.0F, 22, 3, 3, 0.0F);
		this.setRotation(liftbicep, 0.0F, -0.5235987901687622F, 0.0F);
		this.leftclaw3 = new ModelRenderer(this, 0, 88);
		this.leftclaw3.setRotationPoint(10.0F, 21.0F, -15.0F);
		this.leftclaw3.addBox(0.0F, 0.0F, 0.0F, 1, 3, 9, 0.0F);
		this.setRotation(leftclaw3, 0.0F, 0.08726646006107329F, 0.0F);
		this.cresthorn10 = new ModelRenderer(this, 0, 144);
		this.cresthorn10.setRotationPoint(-7.0F, -31.0F, -35.0F);
		this.cresthorn10.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
		this.setRotation(cresthorn10, -0.22689279913902283F, -0.6981316804885863F, 0.0F);
		this.cresthorn4 = new ModelRenderer(this, 0, 172);
		this.cresthorn4.setRotationPoint(5.0F, -38.0F, -37.0F);
		this.cresthorn4.addBox(-2.0F, 0.0F, 0.0F, 2, 2, 14, 0.0F);
		this.setRotation(cresthorn4, 0.08726646006107329F, 0.34906584024429316F, 0.0F);
		this.neck3 = new ModelRenderer(this, 477, 114);
		this.neck3.setRotationPoint(-5.0F, -31.0F, -30.0F);
		this.neck3.addBox(0.0F, 0.0F, 0.0F, 9, 8, 9, 0.0F);
		this.setRotation(neck3, -0.6108652353286743F, -0.0F, 0.0F);
		this.horn2 = new ModelRenderer(this, 0, 124);
		this.horn2.setRotationPoint(-2.0F, -39.0F, -49.0F);
		this.horn2.addBox(0.0F, -4.0F, -3.0F, 3, 5, 3, 0.0F);
		this.setRotation(horn2, -0.6108652353286743F, -0.0F, 0.0F);
		this.rightforearm = new ModelRenderer(this, 0, 102);
		this.rightforearm.mirror = true;
		this.rightforearm.setRotationPoint(-26.0F, -23.0F, -4.0F);
		this.rightforearm.addBox(-24.0F, 0.0F, -2.0F, 24, 2, 2, 0.0F);
		this.setRotation(rightforearm, 0.0F, -0.6981316804885863F, 0.0F);
		this.cresthorn5 = new ModelRenderer(this, 0, 172);
		this.cresthorn5.setRotationPoint(-6.0F, -38.0F, -37.0F);
		this.cresthorn5.addBox(0.0F, 0.0F, 0.0F, 2, 2, 14, 0.0F);
		this.setRotation(cresthorn5, 0.08726646006107329F, -0.34906584024429316F, 0.0F);

		this.cresthorn7 = new ModelRenderer(this, 0, 159);
		this.cresthorn7.setRotationPoint(6.0F, -35.0F, -36.0F);
		this.cresthorn7.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F);
		this.setRotation(cresthorn7, 0.0F, 0.34906584024429316F, 0.0F);
		this.rightclaw2 = new ModelRenderer(this, 0, 79);
		this.rightclaw2.setRotationPoint(-6.0F, 22.0F, -13.0F);
		this.rightclaw2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 7, 0.0F);
		this.setRotation(rightclaw2, 0.0F, -0.34906584024429316F, 0.0F);
		this.leftforearm = new ModelRenderer(this, 0, 102);
		this.leftforearm.setRotationPoint(25.0F, -23.0F, -4.0F);
		this.leftforearm.addBox(0.0F, 0.0F, -2.0F, 24, 2, 2, 0.0F);
		this.setRotation(leftforearm, 0.0F, 0.6981316804885863F, 0.0F);
		this.cresthorn8 = new ModelRenderer(this, 0, 149);
		this.cresthorn8.setRotationPoint(-7.0F, -33.0F, -36.0F);
		this.cresthorn8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F);
		this.setRotation(cresthorn8, -0.08726646006107329F, -0.6108652353286743F, 0.0F);
		this.cresthorn6 = new ModelRenderer(this, 0, 159);
		this.cresthorn6.setRotationPoint(-7.0F, -35.0F, -36.0F);
		this.cresthorn6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F);
		this.setRotation(cresthorn6, 0.0F, -0.43633231520652765F, 0.0F);
		this.stomach = new ModelRenderer(this, 434, 33);
		this.stomach.setRotationPoint(-10.0F, -24.0F, -12.0F);
		this.stomach.addBox(0.0F, 0.0F, 0.0F, 19, 20, 20, 0.0F);
		this.setRotation(stomach, -0.17453292012214658F, -0.0F, 0.0F);
		this.cresthorn9 = new ModelRenderer(this, 0, 150);
		this.cresthorn9.setRotationPoint(6.0F, -33.0F, -36.0F);
		this.cresthorn9.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F);
		this.setRotation(cresthorn9, -0.08726646006107329F, 0.6108652353286743F, 0.0F);
		this.lefthook = new ModelRenderer(this, 0, 100);
		this.lefthook.setRotationPoint(42.0F, -22.5F, -20.5F);
		this.lefthook.addBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F);

		ModelRenderer LeftLeg1 = new ModelRenderer(this, 442, 0);
		LeftLeg1.setRotationPoint(8.0F, 1.0F, -7.0F);
		LeftLeg1.addBox(0.0F, 0.0F, 0.0F, 10, 23, 10, 0.0F);

		ModelRenderer LeftLeg2 = new ModelRenderer(this, 482, 0);
		LeftLeg2.setRotationPoint(15.0F, -14.0F, -11.0F);
		LeftLeg2.addBox(-8.0F, 0.0F, 0.0F, 8, 22, 7, 0.0F);
		setRotation(LeftLeg2, -0.08726646006107329F, -0.0F, -0.08726646006107329F);

		ModelRenderer leftLeg = new ModelRenderer(this);
		leftLeg.addChild(LeftLeg1);
		leftLeg.addChild(LeftLeg2);
		legs.add(leftLeg);

		ModelRenderer RightLeg1 = new ModelRenderer(this, 442, 0);
		RightLeg1.setRotationPoint(-5.0F, 1.0F, -7.0F);
		RightLeg1.addBox(-12.0F, 0.0F, 0.0F, 10, 23, 10, 0.0F);

		ModelRenderer RightLeg2 = new ModelRenderer(this, 482, 0);
		RightLeg2.setRotationPoint(-6.0F, -14.0F, -11.0F);
		RightLeg2.addBox(-8.0F, 0.0F, 0.0F, 8, 22, 7, 0.0F);
		setRotation(RightLeg2, -0.08726646006107329F, -0.0F, 0.08726646006107329F);

		ModelRenderer rightLeg = new ModelRenderer(this);
		leftLeg.addChild(RightLeg1);
		leftLeg.addChild(RightLeg2);
		legs.add(rightLeg);

		this.tail5 = new ModelRenderer(this, 230, 233);
		this.tail5.setRotationPoint(-2.0F, 3.0F, 77.0F);
		this.tail5.addBox(0.0F, 0.0F, 0.0F, 3, 3, 20, 0.0F);
		this.tail6 = new ModelRenderer(this, 188, 235);
		this.tail6.setRotationPoint(-1.0F, 4.0F, 96.0F);
		this.tail6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 20, 0.0F);
		this.righthook = new ModelRenderer(this, 0, 100);
		this.righthook.setRotationPoint(-42.0F, -22.5F, -20.5F);
		this.righthook.addBox(-5.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F);
		this.spike3 = new ModelRenderer(this, 8, 63);
		this.spike3.setRotationPoint(-1.0F, -31.0F, -6.0F);
		this.spike3.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
		this.setRotation(spike3, -0.17453292012214658F, -0.0F, 0.0F);
		this.leftclaw4 = new ModelRenderer(this, 0, 88);
		this.leftclaw4.setRotationPoint(15.0F, 21.0F, -15.0F);
		this.leftclaw4.addBox(0.0F, 0.0F, 0.0F, 1, 3, 9, 0.0F);
		this.setRotation(leftclaw4, 0.0F, -0.08726646006107329F, 0.0F);
		this.cresthorn11 = new ModelRenderer(this, 0, 144);
		this.cresthorn11.setRotationPoint(5.0F, -31.0F, -35.0F);
		this.cresthorn11.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
		this.setRotation(cresthorn11, -0.22689279913902283F, 0.6981316804885863F, 0.0F);

		this.leftwing = new ModelRenderer(this, 0, 0);
		this.leftwing.mirror = true;
		this.leftwing.setRotationPoint(6.0F, -22.0F, 43.0F);
		this.leftwing.addBox(0.0F, 0.0F, -60.0F, 110, 0, 60, 0.0F);
		this.upperbody = new ModelRenderer(this, 463, 73);
		this.upperbody.setRotationPoint(-8.0F, -26.0F, -18.0F);
		this.upperbody.addBox(0.0F, 0.0F, 0.0F, 15, 13, 10, 0.0F);
		this.setRotation(upperbody, -0.43633231520652765F, -0.0F, 0.0F);
		this.rightclaw3 = new ModelRenderer(this, 0, 88);
		this.rightclaw3.setRotationPoint(-15.0F, 21.0F, -15.0F);
		this.rightclaw3.addBox(0.0F, 0.0F, 0.0F, 1, 3, 9, 0.0F);
		this.setRotation(rightclaw3, 0.0F, 0.08726646006107329F, 0.0F);
		this.rightbicep = new ModelRenderer(this, 0, 106);
		this.rightbicep.setRotationPoint(-8.0F, -23.0F, -17.0F);
		this.rightbicep.addBox(-22.0F, 0.0F, 0.0F, 22, 3, 3, 0.0F);
		this.setRotation(rightbicep, 0.0F, 0.5235987901687622F, 0.0F);

		ModelRenderer Head = new ModelRenderer(this, 0, 230);
		Head.mirror = true;
		Head.setRotationPoint(-0.5F, -31.0F, -35.0F);
		Head.addBox(-6.5F, -8.0F, -18.0F, 13, 8, 18, 0.0F);
		setRotation(Head, 0.08726646006107329F, -0.0F, 0.0F);

		this.rightclaw4 = new ModelRenderer(this, 0, 88);
		this.rightclaw4.setRotationPoint(-10.0F, 21.0F, -15.0F);
		this.rightclaw4.addBox(0.0F, 0.0F, 0.0F, 1, 3, 9, 0.0F);
		this.setRotation(rightclaw4, 0.0F, -0.08726646006107329F, 0.0F);

		ModelRenderer Jaw = new ModelRenderer(this, 62, 227);
		Jaw.setRotationPoint(-0.5F, -31.0F, -35.0F);
		Jaw.addBox(-7.0F, 0.0F, -19.0F, 14, 10, 19, 0.0F);

		this.leftclaw2 = new ModelRenderer(this, 0, 79);
		this.leftclaw2.setRotationPoint(19.0F, 22.0F, -13.0F);
		this.leftclaw2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 7, 0.0F);
		this.setRotation(leftclaw2, 0.0F, -0.34906584024429316F, 0.0F);
		this.cresthorn1 = new ModelRenderer(this, 0, 208);
		this.cresthorn1.setRotationPoint(-1.5F, -38.0F, -37.0F);
		this.cresthorn1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 20, 0.0F);
		this.setRotation(cresthorn1, 0.5235987901687622F, -0.0F, 0.0F);
		this.spike4 = new ModelRenderer(this, 12, 64);
		this.spike4.setRotationPoint(-1.0F, -28.0F, 2.0F);
		this.spike4.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
		this.setRotation(spike4, -0.17453292012214658F, -0.0F, 0.0F);
		this.spike2 = new ModelRenderer(this, 4, 64);
		this.spike2.setRotationPoint(-1.0F, -31.0F, -13.0F);
		this.spike2.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
		this.setRotation(spike2, -0.2617993950843811F, -0.0F, 0.0F);
		this.tail2 = new ModelRenderer(this, 380, 226);
		this.tail2.setRotationPoint(-6.0F, -10.0F, 23.0F);
		this.tail2.addBox(0.0F, 0.0F, 0.0F, 11, 10, 20, 0.0F);
		this.setRotation(tail2, -0.2617993950843811F, -0.0F, 0.0F);
		this.horn4 = new ModelRenderer(this, 0, 112);
		this.horn4.setRotationPoint(-1.0F, -48.0F, -42.0F);
		this.horn4.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
		this.setRotation(horn4, -1.0471975803375244F, -0.0F, 0.0F);
		this.cresthorn2 = new ModelRenderer(this, 0, 188);
		this.cresthorn2.setRotationPoint(-5.0F, -38.0F, -37.0F);
		this.cresthorn2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 18, 0.0F);
		this.setRotation(cresthorn2, 0.43633231520652765F, -0.08726646006107329F, 0.0F);
		this.horn3 = new ModelRenderer(this, 0, 117);
		this.horn3.setRotationPoint(-1.5F, -47.0F, -45.0F);
		this.horn3.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
		this.setRotation(horn3, -0.8726646304130553F, -0.0F, 0.0F);
		this.rightclaw5 = new ModelRenderer(this, 0, 72);
		this.rightclaw5.setRotationPoint(-13.0F, 16.0F, 3.0F);
		this.rightclaw5.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
		this.setRotation(rightclaw5, -0.43633231520652765F, -0.0F, 0.0F);
		this.spike1 = new ModelRenderer(this, 0, 65);
		this.spike1.setRotationPoint(-1.0F, -31.0F, -20.0F);
		this.spike1.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
		this.setRotation(spike1, -0.2617993950843811F, -0.0F, 0.0F);
		this.tail1 = new ModelRenderer(this, 442, 222);
		this.tail1.setRotationPoint(-8.0F, -18.0F, 7.0F);
		this.tail1.addBox(0.0F, 0.0F, 0.0F, 15, 14, 20, 0.0F);
		this.setRotation(tail1, -0.34906584024429316F, -0.0F, 0.0F);
		this.spike5 = new ModelRenderer(this, 16, 65);
		this.spike5.setRotationPoint(-1.0F, -23.0F, 10.0F);
		this.spike5.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
		this.setRotation(spike5, -0.2617993950843811F, -0.0F, 0.0F);
		this.tail3 = new ModelRenderer(this, 326, 229);
		this.tail3.setRotationPoint(-4.0F, -4.0F, 40.0F);
		this.tail3.addBox(0.0F, 0.0F, 0.0F, 7, 7, 20, 0.0F);
		this.setRotation(tail3, -0.17453292012214658F, -0.0F, 0.0F);
		this.spike6 = new ModelRenderer(this, 20, 67);
		this.spike6.setRotationPoint(-1.0F, -18.0F, 17.0F);
		this.spike6.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
		this.setRotation(spike6, -0.2617993950843811F, -0.0F, 0.0F);
	}
}
