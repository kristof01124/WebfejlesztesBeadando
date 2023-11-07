import './crud.css'
import CRUDTable,
    * as reactCrudTable from 'react-crud-table';
import { OrderController } from '../controller/orderController';
import { Link } from 'react-router-dom';


const DescriptionRenderer = ({ field }) => <textarea {...field} />;


const styles = {
    container: { margin: 'auto', width: 'fit-content' },
};

export function OrderView() {
    return (
        <div style={styles.container}>
            <Link to="/siteUsers">Users</Link>
            <CRUDTable
                caption="Orders"
                fetchItems={() => OrderController.getAll()}
            >
                <reactCrudTable.Fields>
                    <reactCrudTable.Field
                        name="orderId"
                        label="Id"
                        hideInCreateForm
                        readOnly
                    />
                    <reactCrudTable.Field
                        name="orderName"
                        label="Name"
                        placeholder="name"
                    />
                    <reactCrudTable.Field
                        name="price"
                        label="Price"
                    />
                    <reactCrudTable.Field
                        name="siteUserId"
                        label="User ID"
                    />
                </reactCrudTable.Fields>
                <reactCrudTable.CreateForm
                    title="Order Creation"
                    message="Create a new order!"
                    trigger="Create new order!"
                    onSubmit={OrderController.createOrder}
                    submitText="Create"
                    validate={(values) => {
                        const errors = {};
                        if (!values.siteUserId) {
                            errors.title = 'Please, provide an user ID!';
                        }

                        return errors;
                    }}
                />

                <reactCrudTable.UpdateForm
                    title="Task Update Process"
                    message="Update task"
                    trigger="Update"
                    onSubmit={OrderController.updateOrder}
                    submitText="Update"
                />

                <reactCrudTable.DeleteForm
                    title="Task Delete Process"
                    message="Are you sure you want to delete the task?"
                    trigger="Delete"
                    onSubmit={OrderController.deleteOrder}
                    submitText="Delete"
                />
            </CRUDTable>
        </div>
    );
}