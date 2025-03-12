package net.cstjean.testmod.item;// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class MiningHelmet1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "mining_helmet_skin"), "main");
	private final ModelPart Head;
	private final ModelPart root_item;
	private final ModelPart helmet_add_on;
	private final ModelPart contour;
	private final ModelPart inside;

	public MiningHelmet1(ModelPart root) {
		this.Head = root.getChild("Head");
		this.root_item = root.getChild("root_item");
		this.helmet_add_on = this.root_item.getChild("helmet_add_on");
		this.contour = this.helmet_add_on.getChild("contour");
		this.inside = this.root_item.getChild("inside");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition root_item = partdefinition.addOrReplaceChild("root_item", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(1.0F)), PartPose.offset(0.0F, -9.0F, 0.0F));

		PartDefinition helmet_add_on = root_item.addOrReplaceChild("helmet_add_on", CubeListBuilder.create().texOffs(40, 3).addBox(-2.0F, -2.0F, -6.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition contour = helmet_add_on.addOrReplaceChild("contour", CubeListBuilder.create().texOffs(0, 11).addBox(5.0F, 2.0F, -6.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 25).addBox(-6.0F, 2.0F, -6.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 39).addBox(-5.0F, 2.0F, 5.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(26, 33).addBox(-5.0F, 2.0F, -6.0F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition inside = root_item.addOrReplaceChild("inside", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(26, 36).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(26, 11).addBox(4.0F, 0.0F, -4.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(26, 22).addBox(-5.0F, 0.0F, -4.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(40, 0).addBox(-4.0F, 0.0F, 4.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		root_item.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}