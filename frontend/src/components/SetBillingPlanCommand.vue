<template>

    <v-card outlined>
        <v-card-title>
            SetBillingPlan
        </v-card-title>

        <v-card-text>
            <String label="TenantId" v-model="value.tenantId" :editMode="editMode"/>
            <String label="PlanType" v-model="value.planType" :editMode="editMode"/>
            <Number label="Rate" v-model="value.rate" :editMode="editMode"/>
            <Number label="Limit" v-model="value.limit" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="setBillingPlan"
            >
                SetBillingPlan
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'SetBillingPlanCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.tenantId = '';
            this.value.planType = '';
            this.value.rate = 0;
            this.value.limit = 0;
        },
        watch: {
        },
        methods: {
            setBillingPlan() {
                this.$emit('setBillingPlan', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

