<template>

    <v-card outlined>
        <v-card-title>
            VerifyDocument
        </v-card-title>

        <v-card-text>
            <String label="DocumentId" v-model="value.documentId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="verifyDocument"
            >
                VerifyDocument
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
        name: 'VerifyDocumentCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.documentId = '';
        },
        watch: {
        },
        methods: {
            verifyDocument() {
                this.$emit('verifyDocument', this.value);
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

